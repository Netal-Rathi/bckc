/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    let one = await promise1.then();
    let two = await promise2.then();
    let data = one + two;

    let ans = new Promise((resolve, reject) => {
        resolve(data);
    })

    return ans;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */
// Title: Add Two Promises
