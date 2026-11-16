Merge Conflict Practice
Objective
Practice creating and resolving a Git merge conflict.

Branches

conflict-branch-A

conflict-branch-B

Conflict Description

Both branches created a file named conflict-practice.txt with different content:

Branch A: Device Status: Active

Branch B: Device Status: Offline

When merging branch B into branch A, Git detected an add/add merge conflict.

Resolution

The conflict was resolved using IntelliJ IDEA by selecting Accept Yours, keeping the content from conflict-branch-A:

Device Status: Active

Result

The merge was completed successfully, and Git created merge commit 699b674.

What I Learned

Git detects conflicts when branches contain incompatible changes.

Conflicts must be resolved before completing a merge.
IntelliJ IDEA provides tools to resolve merge conflicts.
A merge commit records the completed merge