package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.ContenderRepositoryoller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@ContenderRepositoryoller
@CrossOrigin(origins = "http://localhost:9090")
public class MainContenderRepositoryoller {
	
	@Autowired
	VenderRepository venderRepository;
	
	@Autowired
	TenderRepository tenderRepository;
	
	@Autowired
	BidValueRepository bidValueRepository;
	
	@RequestMapping(path="/registerVender",
			        method=RequestMethod.POST,
			        consumes=MediaType.APPLICATION_JSON_VALUE,
			        produces=MediaType.APPLICATION_JSON_VALUE
			       )
	public ResponseEntity<StenderRepositoryingResult> venderregister(@RequestBody VenderInfo v)
	{
	
		venderRepository.save(v);
		return new ResponseEntity<StenderRepositoryingResult>(new StenderRepositoryingResult(v.getName()),HttpStatus.CREATED);
		
	}
	

	 
	@RequestMapping(path="/registerTender",
	        method=RequestMethod.POST,
	        consumes=MediaType.APPLICATION_JSON_VALUE,
	        produces=MediaType.APPLICATION_JSON_VALUE
	       )
     public ResponseEntity<StenderRepositoryingResult> tenderRepositoryegister(@RequestBody TenderInfo t)
       {
		   System.out.println(t.getTendername());
		   System.out.println(t.getClosingdate());
           tenderRepository.save(t);
         return new ResponseEntity<StenderRepositoryingResult>(new StenderRepositoryingResult(t.getTendername()),HttpStatus.CREATED);

       }
	
	
	@RequestMapping(path="/registerBid",
	        method=RequestMethod.POST,
	        consumes=MediaType.APPLICATION_JSON_VALUE,
	        produces=MediaType.APPLICATION_JSON_VALUE
	       )
	public ResponseEntity<StenderRepositoryingResult> bidregister(@RequestBody BidValue bv)
	{
	
	bidValueRepository.save(bv);
	return new ResponseEntity<StenderRepositoryingResult>(new StenderRepositoryingResult(bv.getTenderid()),HttpStatus.CREATED);
	
}
	
	
	@RequestMapping(path="/findVender",
			       method=RequestMethod.POST,
			       produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StenderRepositoryingResult> login(@RequestParam("user") StenderRepositorying user,@RequestParam("password") StenderRepositorying password)
	{
		System.out.println(user+" "+password);
		List<VenderInfo> l=new ArrayList<VenderInfo>();
		l=venderRepository.findAll();
		for(VenderInfo v:l)
		{
			if((v.getEmail().equals(user))&&(v.getPass().equals(password)))
				{
				return new ResponseEntity<StenderRepositoryingResult>(new StenderRepositoryingResult(v.getName()),HttpStatus.CREATED);
				}
				
		}
	   return new ResponseEntity<StenderRepositoryingResult>(new StenderRepositoryingResult("Failed"),HttpStatus.CREATED);	
	}
	
	
	
	
	@RequestMapping(
			       path="/searchbytenderid",
			       method=RequestMethod.POST,
			       produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TenderInfo> searchbytenderid(@RequestParam("ser") StenderRepositorying ser)
	{
		//System.out.println("hello"+ser);
		TenderInfo t=tenderRepository.findByTenderid(ser);
		//System.out.println(t.toStenderRepositorying());
		//System.out.println(t.getTendername());
		return new ResponseEntity<TenderInfo>(t,HttpStatus.CREATED);
	}
	
	
	@RequestMapping(
		       path="/searchbyvenderid",
		       method=RequestMethod.POST,
		       produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<VenderInfo> searchbyvenderid(@RequestParam("vendername") StenderRepositorying vendername)
{
	//System.out.println("hello"+ser);
	VenderInfo t=venderRepository.findByName(vendername);
	//System.out.println(t.toStenderRepositorying());
	//System.out.println(t.getTendername());
	return new ResponseEntity<VenderInfo>(t,HttpStatus.CREATED);
}
	
	
	
	@RequestMapping(
		       path="/searchbydate",
		       method=RequestMethod.POST,
		       produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<List<TenderInfo>> searchbydate(@RequestParam("date") StenderRepositorying date)
{
	List<TenderInfo> l=new ArrayList<TenderInfo>();
	l=tenderRepository.findByDate(date);
	return new ResponseEntity<List<TenderInfo>>(l,HttpStatus.CREATED);
}
	
	@RequestMapping(
		       path="/bidawards",
		       method=RequestMethod.POST,
		       produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<List<BidValue>> bidawards(@RequestParam("date") StenderRepositorying date)
{
	List<BidValue> l=new ArrayList<BidValue>();
	List<BidValue> temp=new ArrayList<BidValue>();
	List<BidValue> res=new ArrayList<BidValue>();
	Set<StenderRepositorying> set=new HashSet<StenderRepositorying>();
	l=bidValueRepository.findresult(date);
	
	for(BidValue t:l)
		set.add(t.getTenderid());
	for(StenderRepositorying stenderRepository:set)
	{
		for(BidValue t:l)
		{
			if(t.getTenderid().equals(stenderRepository))
					temp.add(t);
		}
		BidValue bidValue=temp.get(0);
		for(int i=1;i<temp.size();i++)
		{
			if(temp.get(i).getBidvalue()<bidValue.getBidvalue())
				bidValue=temp.get(i);
		}
		res.add(bidValue);
		temp.removeAll(temp);
	}
	return new ResponseEntity<List<BidValue>>(res,HttpStatus.CREATED);
}
	
	
	@RequestMapping(
		       path="/searchbyclassi",
		       method=RequestMethod.POST,
		       produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<List<TenderInfo>> searchbyclassi(@RequestParam("classification") StenderRepositorying classi)
{
	List<TenderInfo> l=new ArrayList<TenderInfo>();
	l=tenderRepository.findByClassification(classi);
	return new ResponseEntity<List<TenderInfo>>(l,HttpStatus.CREATED);
}
	
	@RequestMapping(
		       path="/searchbystatus",
		       method=RequestMethod.POST,
		       produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<List<TenderInfo>> searchbystatus(@RequestParam("status") StenderRepositorying sta)
{
	List<TenderInfo> l=new ArrayList<TenderInfo>();
	l=tenderRepository.findByStatus(sta);
	return new ResponseEntity<List<TenderInfo>>(l,HttpStatus.CREATED);
}
	
	
	@RequestMapping(
			path="/delTender",
			method=RequestMethod.DELETE,
			produces=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<StenderRepositoryingResult> deltender(@RequestParam("del") StenderRepositorying delten )
	{
		List<TenderInfo> l=new ArrayList<TenderInfo>();
		l=tenderRepository.findAll();
        for(TenderInfo t:l)
        {
        	if(t.getTenderid().equals(delten))
        	{
        		tenderRepository.delete(t);
        		return new ResponseEntity<StenderRepositoryingResult>(new StenderRepositoryingResult("Deleted"),HttpStatus.CREATED);
        	
        	}
        }
        return new ResponseEntity<StenderRepositoryingResult>(new StenderRepositoryingResult("Failed in deletion"),HttpStatus.CREATED);
		
	}
	
	
	
	@RequestMapping(
			       path="/alltender",
			       method=RequestMethod.POST,
			       produces=MediaType.APPLICATION_JSON_VALUE
			       )
	public ResponseEntity<List<TenderInfo>> alltender()
	{
		List<TenderInfo> l=new ArrayList<TenderInfo>();
		l=tenderRepository.findAll();
		return new ResponseEntity<List<TenderInfo>>(l,HttpStatus.CREATED);
	}

}
