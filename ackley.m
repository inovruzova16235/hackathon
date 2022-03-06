function E = ackley(x0, x, y)
a = x0(1); b = x0(2); c = x0(3);

E = sum ((-1) * a * exp( (-1) * b * sqrt( (1 / 3) * s1 ) ) - exp( (1 / 3) * s2 ) + a + exp(1) - y).^2 