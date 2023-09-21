s=input()
s=list(s)
n=len(s)
i=0
while(i<n):
  if s[i]=='*':
    s[i-1],s[i-2]=s[i-2],s[i-1]
  i+=1
res=[]
i=0
while(i<n):
  if s[i].isalpha() or s[i]=='0':
    res.append(s[i])
  i+=1
i=len(res)-1
tp=0
while(i>=0):
  if res[i]=='0':
    res[i]=s[tp]
    tp+=1
  i-=1
print(''.join(res))