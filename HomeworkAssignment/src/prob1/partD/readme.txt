SOLUTION OUTPUT:

The key is mutable for this reason when we use tracker.get(e).setVisited(true), we change the key.
We need remove this line because we can't change the key.