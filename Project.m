close all; clc

x = 1:10;
y = [2.3302351378277 3.021646007392626 3.688265502673382 4.330982548426512 4.9506541959345896 5.548106765868255 6.124136950169497 6.679512874425665 7.214975122150662 7.73123772233939];

plot(x, y, 'k+'), hold on

a = 20;
b = 0.2;
c = 2 * pi;
d = 3;

for i = 1:d
    s1 = s1 + x * x;
end

for i = 1:d
    s2 = s2 + cos(c * x);
end

f = (-1) * a * exp((-1) * b * sqrt((1 / 3) * s1)) - exp(1 / 3 * s2) + a + exp(1);
plot(x, y, 'm');

cfcnt = fminsearch('ackley', [a b c], [], x, y);

a1 = cfcnt(1); b1 = cfcnt(2); c1 = cfcnt(3);

for i = 1:d
    s2 = s2 + cos(c1 * x);
end

f2 = (-1) * a1 * exp((-1) * b1 * sqrt((1 / 3) * s1)) - exp(1 / 3 * s2) + a1 + exp(1);
plot(x, f2, 'c');