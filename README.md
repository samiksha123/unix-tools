unix-tools
==========

Steps to run unixtools commands
===============

WC
--------------

*Word Count*

**sa_wc filename**

    `example = sa_wc one.txt`

*This will display number of lines,words and characters from specified file*


## Head

**sa_wc filename**

    `example = sa_head one.txt`
    
It will print top 10 lines of file

**sa_wc -number-of-lines  filename**

    `example = sa_wc -5 one.txt`
    
It will print top 5 lines of file   


## Tail

**sa_wc filename**

    `example = sa_wc one.txt`
It will print last 10 lines of file   
**sa_wc -number-of-lines filename**

    `example = sa_tail -5 one.txt`
It will print last 5 lines of file  


## Uniq
**sa_unique filename**

    `example = sa_unique one.txt`
It will print only unique lines of file.


## Cut

**sa_cut filename fieldnumber delimiter**

    `example = sa_cut one.txt -f1 -d, `
It will print 1st field of file.    


## Sort

**sa_sort filename**

    `example = sa_sort one.txt`
    
It will print file data in sorted order.

**sa_sort filename -r**

    `example = sa_sort one.txt -r`
    
It will print file data in sorted reverse order. 


## ReduceSpace

**sa_reduceSpace filename**

    `sa_reduceSpace one.txt`
    
It will remove extra spaces from file and rewrite that file.    

