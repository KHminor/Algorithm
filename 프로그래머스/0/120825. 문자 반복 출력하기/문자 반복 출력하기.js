function solution(my_string, n) {
    const result = []
    my_string.split("").map(s => {
        new Array(n).fill(0).map(_ => result.push(s))
    })
    return result.join("")
}