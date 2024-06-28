function solution(arr1, arr2) {
    if (arr1.length > arr2.length) return 1
    else if (arr2.length > arr1.length) return -1
    else {
        let a1 = arr1.reduce((hap,i)=>hap+i,0)
        let a2 = arr2.reduce((hap,i)=>hap+i,0)
        if (a1>a2) return 1
        else if (a2>a1) return -1
        else return 0
        
    }
}