function solution(num_list) {
    const result = [0,0]
    num_list.map(val=> {
        if (val%2) result[1] += 1;
        else result[0] += 1;
    })
    return result;
}