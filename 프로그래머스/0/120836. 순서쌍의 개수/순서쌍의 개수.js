function solution(n) {
    let state = false
    let result = 0
    for (let i=1; i<=Math.floor(Math.sqrt(n)); i++) {
        if (n%i === 0) {
            if (i === Math.floor(n/i)) state = true
            result += 1
        }
    }

    return (state)?result*2-1:result*2
}