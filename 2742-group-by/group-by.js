/**************************\U0001f60e**************************/
Array.prototype.groupBy = function (fn) {
  const newObject = {};
  for (const currentElement of this) {
    let key = fn(currentElement);
    newObject[key] ??= [];
    newObject[key].push(currentElement);
  }
  return newObject;
};