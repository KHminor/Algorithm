function solution(todo_list, finished) {
    const result = []
    todo_list.map((i,idx)=> {
        if (!finished[idx]) result.push(i)
    });
    return result
}