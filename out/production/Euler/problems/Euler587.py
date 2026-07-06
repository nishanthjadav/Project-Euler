import sympy as sp
import math

def compute_integral(n):
    x1, y1 = -0.5, -0.5
    x2, y2 = n - 0.5, 0.5

    m = (y2 - y1) / (x2 - x1)

    x = sp.Symbol('x', real=True)

    y = m * (x + 0.5) - 0.5

    eq = sp.Eq(x**2 + y**2, 1/4)
    solutions = sp.solve(eq, x)

    x_bound = None
    for sol in solutions:
        sol_val = sp.N(sol)
        if sol_val.is_real and sol_val < 0:
            x_bound = sol_val
            break

    if x_bound is None:
        raise ValueError("No valid negative intersection found.")

    integrand = y + sp.sqrt(1/4 - x**2)

    result = sp.integrate(integrand, (x, -0.5, x_bound))

    result = sp.N(result)

    return float(result), float(x_bound), float(m)


if __name__ == "__main__":
    for n in range (2200, 3000):
        area, x_intersection, slope = compute_integral(n)

        #print("Slope m:", slope)
        #print("Intersection x:", x_intersection)
        #print("Integral result:", area)

        concaveTriangleArea = -1 * area
        r = .5
        LRegion = (4 - math.pi) * (r * r) / 4

        res = 1 - (concaveTriangleArea / LRegion)
        print(f"{n}: {res * 100}")
