import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Job } from 'src/app/common/job';

@Injectable({
  providedIn: 'root'
})
export class JobsService {
  
  private urlBase = 'http://localhost:8080/';
  private pathJobs ='jobs';

  constructor(private httpClient: HttpClient) { }

  getJobs (): Observable<Job[]> {
    return this.httpClient.get<Job[]>(this.urlBase+this.pathJobs);
  }

  updateHabilitado(job : Job){
    this.httpClient.put(this.urlBase+'/'+job.nombre, {"job" : job});
  }



}
