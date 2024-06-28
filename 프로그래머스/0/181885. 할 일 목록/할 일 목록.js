function solution(todo_list, finished) {
    let result = []
    todo_list.map((i,idx)=> {
        if (!finished[idx]) {result = [...result,i]}
    });
    return result
}