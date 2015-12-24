# Enter your code here. Read input from STDIN. Print output to STDOUT
from scipy.stats import norm
print ((norm.ppf(0.90))*200+2000)
