def solution(numer1, denom1, numer2, denom2):
    
    def LCM(a,b,gcd):
        return b//gcd*a
    
    def GCD(a,b):
        while a != 0:
            a,b = b%a,a
        return b
    
    lcm = LCM(denom1,denom2, GCD(denom1,denom2))
    x = GCD(lcm//denom1*numer1+lcm//denom2*numer2,lcm)
    return [(lcm//denom1*numer1+lcm//denom2*numer2)//x,lcm//x]