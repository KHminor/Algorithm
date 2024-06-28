function solution(arr) {
    var answer = [];
    arr.map(i=> answer = [...answer,...Array(i).fill(i)])
    return answer;
}