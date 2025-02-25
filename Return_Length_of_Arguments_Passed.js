/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    let count = 0;
    for(let i=args.length -1; i>=0; i--){
        count++;
    }
    return count;
};
// Title: Return Length of Arguments Passed
