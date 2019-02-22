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
