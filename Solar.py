'''
Created on Feb 15, 2017

@author: Tony Harrell
'''
import math;

def answer(area):
    fList = [];
    
    solarPanelCalc(area, fList);
    fList.reverse();
    return fList;

def solarPanelCalc(area, fList):
    pArea = 0;
    
    if area >= 1 and area <= 1000000:
        tmp = int(math.sqrt(area));
        print tmp;
        if tmp <= 0:
            return pArea;
        else:
            pArea = int(math.pow(tmp, 2));
            nArea = area - pArea;
            solarPanelCalc(nArea, fList);
            fList.append(pArea);
        return pArea;
    
print answer(12);