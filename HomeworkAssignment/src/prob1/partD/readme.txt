SOLUTION OUTPUT:

In this exercise the HashMap is using a mutable key, with this line "tracker.get(e).setVisited(true)" 
we change the value of "visited" variable, this is part of the key.
We need remove this line because we should not change the key.