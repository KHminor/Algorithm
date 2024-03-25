function solution(s1, s2) {
    const one = new Set(s1)
    const two = new Set(s2)
    
    return ([...s1].filter((val)=>two.has(val))).length;
}