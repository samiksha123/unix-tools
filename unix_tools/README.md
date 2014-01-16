Steps to run unixtools commands
===============

WC
--------------

*Word Count*

**sa_wc.sh filename**

    `example = sa_wc.sh one.txt`

*This will display number of lines,words and characters from specified file*


## Head

**sa_head.sh filename**

    `example = sa_head.sh one.txt`
    
It will print top 10 lines of file

**sa_head.sh -number-of-lines  filename**

    `example = sa_head.sh -5 one.txt`
    
It will print top 5 lines of file   


## Tail

**sa_tail.sh filename**

    `example = sa_tail.sh one.txt`
It will print last 10 lines of file   
**sa_tail.sh -number-of-lines filename**

    `example = sa_tail.sh -5 one.txt`
It will print last 5 lines of file  


## Unique
**sa_unique.sh filename**

    `example = sa_unique.sh one.txt`
It will print only unique lines of file.


## Cut

**sa_cut.sh filename fieldnumber delimiter**

    `example = sa_cut.sh one.txt -f1 -d, `
It will print 1st field of file.    


## Sort

**sa_sort.sh filename**

    `example = sa_sort.sh one.txt`
    
It will print file data in sorted order.

**sa_sort.sh filename -r**

    `example = sa_sort.sh one.txt -r`
    
It will print file data in sorted reverse order. 


## ReduceSpace

**sa_reduceSpace.sh src_file dest_file**

    `sa_reduceSpace.sh one.txt two.txt`
    
It will remove extra spaces from source file and write content in destination file .    

*src->client->main files*

*src->samiksha.unixtools->library files*

*test->samiksha.unixtools->test files*


*your classpath name must be "UNIX_TOOLS"*

*classpath contains path of shFiles folder*

*where ever you put shFiles folder, classpath must contain path of that folder*

*example = "D:\projects\unix-tools\shFiles"*
