# Class Station

## ATTRIBUTES
- ```id``` identifier of the station.
- ```address``` address of the station.
- ```numberAnchors``` number of anchors of the station.
- ```anchors [numberAnchors]``` array where you will store the bicycles that are anchored in the station.
## METHODS
- ```checkStation()``` shows a message with id, address and numberAnchorages.
- ```freeAnchorages()``` returns the amount of free anchors.
- ```checkAnchorages()``` go through the anchors array and show the id of the bike anchored or if it is free.
- ```anchorBike (bike)``` inserts the bicycle object in the first free register of the anchors array and calls ```displayAnchor()```-
- ```printBike(bicycle, numberAnchor)``` shows a message with the id of the bicycle anchored and on which anchor it has been anchored.
- ```readUserCard(usercard)``` checks if the user card is activated.
- ```makeAnchorage()``` returns a random position between the number of anchors. Use ThreadLocalRandom.current().
- ```removeBike(usercard)``` if the user card is activated, remove a bike from the anchor and display its information on the screen by calling to ```printBike(bicycle, number of anchor)``` To simulate that a user of the service anchors a bike, you must generate a position at random between the anchors and eliminate that bike with the method ```makeAnchorage()``` .To eliminate a bike from the array you must put that position of the ```array``` to ```null```.
- ```printAnchorage(bicycle, numberAnchor)``` shows a message with the id of the bicycle anchored and on which anchor it has been anchored.
