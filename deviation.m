function res = deviation(n, x, mean)

for i = 1:30
    sum = sum + (x - mean) ^ 2;
end

res = sqrt(sum / 30);