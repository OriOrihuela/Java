# Person Package
## Contains three classes:
### Person (abstract one)
***Properties:***
- `name`: necessary for a person.
- `surname`: nothing more to say :D.
- `dni`: identifies the person.
- `bith`: the date when the person was born.

***Behaviours:***
- `Get&Set`: just to encapsulate the properties properly.
- `validateDNI`: this method allows us to check if the input DNI is the same as the one who owns the person.
- `toString`: override of the toString() Object method.

### Employee
***Properties:***
- `employeeID`: an ID to identify the employee within the library.
- `wantToBeEmployee`: a state that shows us if the employee wants to continue being an employee or not.
- `libraryWhereWorks`: the library where the employee works.

***Behaviours:***
- `Get&Set`: just to encapsulate the properties properly.
### Member
***Properties:***
- `memberID`: an ID to identify the member within the library.
- `wantToBeMember`: a state that shows us if the member wants to continue being a member or not...
- `associatedLibrary`: the library where the member is associated.

***Behaviours:***
- `Get&Set`: just to encapsulate the properties properly.
