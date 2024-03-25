function solution(sides) {
    let li = sides.sort((a,b)=>a-b)
    return (li.slice(0,li.length-1).reduce((hap,val)=>hap+val,0) > li[li.length-1])?1:2;
}