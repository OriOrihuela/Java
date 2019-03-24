# Public Entity Package
## Contains three classes:
### Public Entity (abstract one)
***Properties:***
- `entityCode`: just to identify the entity with an id.
- `entityName`: nothing more to say :D.
- `address`: where the public entity is established.

***Behaviours:***
- `Get&Set`: just to encapsulate the properties properly.
- `showLibrary`: this method allows us to view a library in question if desired. The characteristics of the library in particular 
will be displayed.
- `toString`: override of the toString() Object method.

### TownHall
***Properties:***
- `major`: the person who rules in the town hall.
- `exampleList`: a list of all the copies that the municipality possesses, whether they are magazines or books.
- `libraryList`: a list of all the bookstores associated with the town hall.

***Behaviours:***
- `Get&Set`: just to encapsulate the properties properly.
- `createLibrary(Library library)`: allows the city council to create a new library.
- `addLibrary`: allows the city council to add a new library into its libraries network.
- `toString`: override of the toString() Object method.
### Library
***Properties:***
- `director`: the person who rules in the library.
- `townHall`: the town hall to which the library belongs.
- `libraryWantsToFire`: situation in which the library decides if wants to fire someone or not.
- `employeeList`: a list of all the employees that work in the library.
- `memberList`: a list of all the associated members to the library.
- `copyList`: all the copies that the library has.

***Behaviours:***
- `Get&Set`: just to encapsulate the properties properly.
- `addEmployee`: add a new employee to the library.
- `removeEmployee`: let go or fires an employee from the library.
- `addMember`: add a new member to the library.
- `removeMember`: let go a member from the library.
- `toString`: override of the toString() Object method.
