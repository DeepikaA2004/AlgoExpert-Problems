n=int(input())
ls=list(map(int,input().split()))
tar=int(input())
# O(N^2)
# for i in range(n):
#   for j in range(i+1,n):
#     if ls[i]+ls[j]==tar:
#       print(ls[i],ls[j])
#       exit()
# Using Set
# st=set()
# for i in ls:
#   if (tar-i) in st:
#     print((tar-i),i)
#   st.add(i)
# Using Dict
from collections import defaultdict as dd
dic=dd(int)
for i in ls: dic[i]+=1
for i in ls:
  tp=tar-i
  if tp in dic and tp==i and dic[tp]>1:
    print(tp,tp)
    break
  elif tp in dic and tp!=i:
    print(i,tp)
    break