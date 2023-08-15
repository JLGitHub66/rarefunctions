#include <stdio.h>
#include <error.h>
#include <stdlib.h>
#include <pthread.h>
void* thread_run(void* _val)
{
	pthread_detach(pthread_self());
	printf("%s\n", (char*)_val);
	return NULL;
}
int main()
{
	pthread_t tid;
	int tret = pthread_create(&tid, NULL, thread_run, "thread_run~~~~~");
	if (tret == 0)
	{
		sleep(1);
		int ret = pthread_join(tid, NULL);
		if (ret == 0)
	{
	printf("pthread_join success\n");
	return ret;
	}
	else
	{
		printf("pthread_join failed info: %s\n", strerror(ret));
		return ret;
	}
	}
	else
	{
		printf("create pthread failed info: %s", strerror(tret));
		return tret;
	}
}
