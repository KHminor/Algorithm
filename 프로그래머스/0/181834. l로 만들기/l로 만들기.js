function solution(myString) {
    const result = []
    Array.from(myString).map(i=>{
        if(i.charCodeAt()<"l".charCodeAt()) result.push("l")
        else result.push(i)
    })
    return result.join("");
}