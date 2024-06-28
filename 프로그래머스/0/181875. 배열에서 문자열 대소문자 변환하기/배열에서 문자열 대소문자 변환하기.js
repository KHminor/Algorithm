function solution(strArr) {
    const result = []
    strArr.map((i,idx)=> {
        if (idx%2) result.push(i.toUpperCase())
        else result.push(i.toLowerCase())
    });
    return result
}