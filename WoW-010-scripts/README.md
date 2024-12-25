# Projet WOW Game 010 Editor Templates/Scripts

## 𝔻𝕖𝕤𝕔𝕣𝕚𝕡𝕥𝕚𝕠𝕟
The provided code is a binary template for analyzing World of Warcraft ADT (Area Data Terrain) files using the 010 Editor. 
This template defines various data structures and functions to read and display information from the binary format of ADT files, which are used to store terrain and object data in the game.
### 1. 𝔹𝕒𝕤𝕚𝕔 𝕋𝕪𝕡𝕖𝕤
  Structures: The template defines several structures to represent different data types, such as D1, D2, and list, which are used to hold various attributes related to terrain chunks and objects.
  Local Variables: The use of local int indicates that these variables are scoped to the current structure or function, which helps manage state during the reading process.
### 2. ℂ𝕙𝕦𝕟𝕜 𝔻𝕖𝕗𝕚𝕟𝕚𝕥𝕚𝕠𝕟𝕤
  _chunk: A base structure that includes a magic number and size, which is common in binary file formats to identify the type of data.
  MCIN, MVER, MHDR, etc.: These structures represent specific chunks in the ADT file, each with its own attributes and offsets to other data.
### 3. ℝ𝕖𝕒𝕕𝕚𝕟𝕘 𝔽𝕦𝕟𝕔𝕥𝕚𝕠𝕟𝕤
  read functions: Each structure has an associated read function (e.g., readD1, readD2, readMHDR) that formats the output for display.
  These functions use SPrintf to create a string representation of the data, which can be viewed in the 010 Editor.
### 4. 𝔻𝕒𝕥𝕒 ℙ𝕣𝕠𝕔𝕖𝕤𝕤𝕚𝕟𝕘
  Nested Structures: The template uses nested structures to read data from the file in a hierarchical manner. For example, data1, data2, data2a, and data2b are used to read different aspects of the terrain data.
  File Seeking: The FSeek function is used extensively to navigate through the binary file based on the offsets defined in the structures.
### 5. Special Features
  Color Coding: The template uses color coding to differentiate between various types of data in the output, making it easier to read and understand.
  Dynamic Arrays: The use of local variables and loops allows for dynamic reading of arrays, such as the number of entries in a list or the number of models in a chunk.
### 6. 𝕊𝕡𝕖𝕔𝕚𝕒𝕝 𝔽𝕖𝕒𝕥𝕦𝕣𝕖𝕤
  MDDF_Entry: Represents a model placement entry with attributes like position, rotation, and scale.
  MODF_Entry: Represents an object placement entry with additional attributes for bounding boxes.
### 7. 𝕄𝕒𝕚𝕟 𝔸𝔻𝕋 𝕊𝕥𝕣𝕦𝕔𝕥𝕦𝕣𝕖
  The ADT_file structure encapsulates the entire ADT file, reading various chunks and storing their data for further processing.
## 𝕍𝕚𝕖𝕨

## Installation
1. Clonez le dépôt.
2. Ouvrez `index.html` dans votre navigateur.

## Contribuer
1. Forkez le projet.
2. Créez une branche pour votre fonctionnalité.
3. Soumettez une pull request.

# Templates
WOW Game

# Scripts
## WOW Game
### ADT
1. ADTHeightModifier
2. ADTMaxModelUIDCalculator
3. ADTModelUIDRecalc
4. ADTOffsetRemover
### MFBO
1. MFBOEditor
### WMO
1. wmo-converter
2. WMONightGlowAdder
3. WMOVertexShadingFlagEnabler
