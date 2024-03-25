function solution(s1, s2) {    
    return [...s1,...s2].length - Array.from(new Set(s1.concat(s2))).length;
}