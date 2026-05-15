package BinaryTrees;

public class LockedTreeState {

    public int numLockedDescendants = 0;
    public boolean locked = false;
    public LockedTreeState parent = null;

    public boolean lock() {
        // RULE 1: Check my own sticker (Descendants) and my own lock status
        if (this.numLockedDescendants > 0 || this.locked == true) {
            return false; // Fail! I cannot lock.
        }

        // RULE 2: Walk up the chain and check my Ancestors
        LockedTreeState curr = this.parent;
        while (curr != null) {
            // BLANK 1: What are we checking on the ancestor to see if we should fail?
            if (curr.locked == true) {
                return false;
            }
            curr = curr.parent;
        }

        // IF WE SURVIVE THE RULES, WE LOCK OURSELVES!
        this.locked = true;

        // RULE 3: Update the stickers of all ancestors (What you just answered!)
        curr = this.parent;
        while (curr != null) {
            // BLANK 2: How do we update the ancestor's sticker?
            curr.numLockedDescendants++;
            curr = curr.parent;
        }

        return true; // Success!
    }
}
