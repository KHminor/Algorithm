function solution(arr, delete_list) {
    var d = new Set(delete_list)
    return arr.filter(i=>!d.has(i))
}