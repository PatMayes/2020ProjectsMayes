import os.path
import matplotlib.pyplot as plt
filename=[]
line=[]
directory=os.path.dirname(os.path.abspath(__file__))                                  
datafile=open(os.path.join(directory, 'StarWarsCharacters.txt'),"r")
for line in datafile:
    Name,Jedi,Droid,HumanLike,Wookie,DarkSide,LightSide,BountyHunter,Smuggler,0,Empire,Rebel,Resistance,FirstOrder,Separatist,GalacticRepublic,Ewok,Fluffy,Slimey,LightsaberColor,Tall,Short,Pilot,Annoying,Cute,BandersFav,GotButtWhooped,InsideATauntaun,StillLiving,LostALimb,SpaceBallsCharacter=line.split("\t")
    
    
