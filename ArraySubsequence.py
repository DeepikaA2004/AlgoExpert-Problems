n=int(input())
ls=list(map(int,input().split()))
m=int(input())
sub=list(map(int,input().split()))
tp=0
for i in ls:
  if tp==m: break
  if i==sub[tp]: tp+=1
if tp==m: print(True)
else: print(False)