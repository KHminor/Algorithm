function solution(n) {
    let result = 0;
    for (i=0; i<=n; i+= 2) result += i;
    return result;
}