from collections import defaultdict as dd
n=int(input())
ls=[]
for i in range(n):
  ls.append(list(input().split()))
res=list(map(int,input().split()))
dic=dd(int)
mx=0
rest=""
for j,i in enumerate(ls):
  dic[i[res[j]^1]]+=1
  if dic[i[res[j]^1]]>mx:
    mx=dic[i[res[j]^1]]
    rest=i[res[j]^1]
print(rest)