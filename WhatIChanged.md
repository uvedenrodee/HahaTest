1. Classes should never be defined in the default package. It's a best practice. One should use the benefits the packages give us (such as modifier acces).

2. Wrote unit tests.

3. Separated the updateQuality logic, so that it can be tested. The tests should test the logic from the method, not if the task runs everynicght or not.

4. Replaced the sttrings with constants, so to avoid typo errors when comparing.

5. Reduced the numbers of if's from the updateQuality method. One can also consider using a switch statement, but I prefer the if's.

6. I should have changed the acces modifier for the attributes of the Item class, but since I can't touch that class, I didn't (maybe I shouldn't have moved it from the default.package?).


