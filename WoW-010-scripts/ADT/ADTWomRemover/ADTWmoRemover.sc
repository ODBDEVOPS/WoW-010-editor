//--------------------------------------
//--- 010 Editor v6.0.3 Script File (BASE)
//
// File:ADT Height Modifier
// Author:Skarn (http://model-changing.net)
// Revision:1.1
// Purpose:Moves the whole ADT along the vertical axis.
// Comes in handy when you need to merge two pieces of maps that have very big height difference.
// Usage: Enter the modifier value (negative or positive) and select your ADTs.
// Advertisement: Model-Changing.net is an ultimate source of information regarding World of Warcraft modding.
//--------------------------------------
char sFile[];
int sIndex;
int k;
int32 modifier = InputNumber("ADT Height Modifier", "Input modifier value:", "0");


TOpenFileNames z = InputOpenFileNames(  "Select .adt files", "(*.adt)" );
 
     for( k = 0; k < z.count; k++ )
     {
        sFile = z.file[k].filename;
        sIndex = FileOpen(sFile);
          if(sIndex < 0)
          return;
        DisableUndo();
        Move();
        FileSave();
        FileClose();
     }

void Move() 
    {
      int z, y, a, p, u;     
      RunTemplate( "WoWADT.bt" );
        
        for( z = 0; z < 16; z++ )
             {
                for( y = 0; y < 16; y++ )
                    {
                       for( a = 0; a < 145; a++)
                            {
                                ADT_file.MCNKs.row[z].mcnk[y].mcvt.heightmap[a] = ADT_file.MCNKs.row[z].mcnk[y].mcvt.heightmap[a] + (modifier); 
                            }                           
                    }
             }
      int16 q_modf = ADT_file.modf.hdr.byte_size / 64;
        
            for ( p = 0; p < q_modf; p++)
                {
                    ADT_file.modf.entry[p].pos.y = ADT_file.modf.entry[p].pos.y + (modifier);
                }
      

     int16 q_mddf = ADT_file.mddf.hdr.byte_size / 36;
            
            for ( u = 0; u < q_mddf; u++)
                {
                    ADT_file.mddf.entry[u].pos.y = ADT_file.mddf.entry[u].pos.y + (modifier);
                }
    }