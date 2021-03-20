import { Component, OnInit } from '@angular/core';
import { Job } from 'src/app/common/job';
import { JobsService } from 'src/app/services/jobs/jobs.service';

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.css']
})
export class JobsComponent implements OnInit {
  
  jobs : Job[] = [new Job('','','','','','','','','','',0,'','','',new Date(),'',new Date())];

  constructor(private jobsServices: JobsService) { }

  ngOnInit(): void {
    this.handlerJobs();
  }

  handlerJobs(): void{
      this.jobsServices.getJobs().subscribe(
        response => {
          this.jobs = response
      });
  }
  
  updateHabilitado(job : Job): void{
     
    if(job.habilitado == 'true'){
         job.habilitado = 'false';
     }
     else{
        job.habilitado == 'true';
     }

     this.jobsServices.updateHabilitado(job);
  }

}
