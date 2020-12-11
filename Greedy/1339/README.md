# 단어 수학
알파벳 대문자로만 이루어져 단어들이 주어질때 각 알파벳 대문자를 0부터 9까지의 숫자 중 하나로 바꿔서 N개의 수를 합하는 문제이다. 같은 알파벳은 같은 숫자로 바꿔야 하며, 두 개 이상의 알파벳이 같은 숫자로 바뀌어지면 안된다. 일반적인 그리디 접근법이 아닌 조금은 아이디어가 필요한 문제. 각각의 알파벳들이 각각의 단어에서 어느 자리수에 위치하는 지 파악 후 자리수에 맞는 10의 거듭제곱 값들을 같은 알파벳들끼리 더해준다. 예를 들어서, ABC와 ATEEAD라는 단어가 있을 때 A에 해당하는 값들의 합은 100000+100+10으로 100110이 된다. 이렇게 모든 알파벳들에 해당하는 값들을 도출한다. 이렇게 각자 알파벳들의 합계가 구해지면서 그리디 알고리즘으로 적용할 수 있는 정당성이 확보된다. 가장 큰 합계를 가지는 알파벳에 9를 곱해주고 마찬가지로 그 다음 큰 합계를 가지는 알파벳에 8을 곱해준다. 같은 방식으로 숫자들을 곱해준 후 모든 값들을 더하면 정답을 얻을 수 있다.