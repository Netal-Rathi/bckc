/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    return arr.sort((a,b)=> fn(a)-fn(b));
};

// (a, b) => a-b; sort no. in ascending order

// It should return a number where:
// -> A negative value indicates thtat a should come before b.
// -> A Positive value indicates thtat a should come after b.
// -> Zero or Null indicates that a and b are considered equal.
// Title: Sort By
