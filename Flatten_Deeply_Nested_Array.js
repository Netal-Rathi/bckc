/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */

var flat = function (arr, n) {
    if(n === 0){
        console.log(arr);
        return arr.slice()
    }  // it create shallow copy of array
    // Q. Why we are using slice method ...
    // Ans. This is because in case we have to modify original array then it create some conflict.

    let flatarr = [];

    for(let i=0; i<arr.length; i++){
        if(Array.isArray(arr[i])){ // this check that at index i there is array or not
            const nested = flat(arr[i], n-1); //if n=0 then it hit base case and return as it is...
            flatarr.push(...nested);
        }else{
            flatarr.push(arr[i]);
        }
    }
    // [1,2,3,[4,5,6],[7,8,[9,10,11],12],[13,14,15]]

    return flatarr;

};
// Title: Flatten Deeply Nested Array
