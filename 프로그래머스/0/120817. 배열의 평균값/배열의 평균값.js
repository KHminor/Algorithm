function solution(numbers) {
    return numbers.reduce((result,val)=>result + val,0)/numbers.length;
}