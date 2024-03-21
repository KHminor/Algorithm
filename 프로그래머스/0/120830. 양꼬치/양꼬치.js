function solution(n, k) {
    console.log(Math.floor(n/10)*2000)
    return n*12000+Math.abs(k-Math.floor(n/10))*2000;
}