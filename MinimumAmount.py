n=int(input())
ls=list(map(int,input().split()))
ls.sort()
res=0
for i in ls:
  if i>res+1:
    break
  res+=i
print(res+1)