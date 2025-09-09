var createCounter = function (init) {
    let current = init;
    let original = init;
    return {
        increment: () => {
            current++;
            return current;
        },
        reset: () => {
            current = original;
            return current;
        },
        decrement: (init) => {
            current--;
            return current;
        }
    }
};